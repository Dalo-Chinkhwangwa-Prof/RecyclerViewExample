package com.example.rvexample.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.rvexample.R
import com.example.rvexample.adapter.RestaurantAdapter
import com.example.rvexample.model.Customer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var customerList: MutableList<Customer>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createCustomers()

        setUpRecyclerView()
    }

    fun createCustomers(){
        customerList = mutableListOf()
        val customer1 = Customer("Dalo", "Sirloin Steak", "Pudding")
        val customer2 = Customer("Fuki", "Salmon", "Ice Cream")
        val customer3 = Customer("Chris", "Fajitas", "Chocolate Cake")
        val customer4 = Customer("Lucas", "Burger", "Vanilla Cake")
        val customer5 = Customer("Brian", "Lasagna", "Shake")
        val customer6 = Customer("David", "Mac n Cheese", "Fudge Cake")

        customerList.add(customer1)
        customerList.add(customer2)
        customerList.add(customer3)
        customerList.add(customer4)
        customerList.add(customer5)
        customerList.add(customer5)
        customerList.add(customer5)
        customerList.add(customer5)
        customerList.add(customer5)
        customerList.add(customer5)
        customerList.add(customer5)
        customerList.add(customer5)
        customerList.add(customer6)
    }

    fun setUpRecyclerView(){
        mainRecyclerView.adapter = RestaurantAdapter(customerList)
        mainRecyclerView.layoutManager = LinearLayoutManager(this)
        (mainRecyclerView.adapter as RestaurantAdapter).notifyDataSetChanged()
    }
}
