package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment2.*

internal class DetailsFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment2,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        product_details_bottom_nav.setOnNavigationItemSelectedListener { menu ->
            childFragmentManager.beginTransaction()
                .replace(
                    R.id.product_details_nav_host,
                    when (menu.itemId) {
                        R.id.tab_fiche -> ProductDetailsFragment()
                        R.id.tab_nutrition -> ProductDetailsSummaryFragment()
//                        R.id.tab_tableau -> Fragment3()
                        else -> throw Exception()
                    }

                )
                .commitAllowingStateLoss()

            true
        }
    }

}
