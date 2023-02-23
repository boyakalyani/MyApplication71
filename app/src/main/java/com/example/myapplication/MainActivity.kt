//package com.example.myapplication
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ArrayAdapter
//import android.widget.ListView
//import android.widget.SearchView
//import android.widget.Toast
//
//class MainActivity : AppCompatActivity() {
//   private lateinit var searchVies:SearchView
//    private lateinit var listVie:ListView
//
//    lateinit var listadapterName: ArrayAdapter<String>
//    lateinit var listNam:ArrayList<String>
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
////inisitizing varible reference id
//        searchVies=findViewById(R.id.search_id)
//        listVie=findViewById(R.id.list_id)
//
//       listNam = ArrayList()
//        listNam.add("C")
//        listNam.add("C#")
//        listNam.add("Java")
//        listNam.add("Javascript")
//        listNam.add("Python")
//       listNam.add("Dart")
//        listNam.add("Kotlin")
//        listNam.add("Typescript")
//
//        listadapterName=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listNam)
//        listVie.adapter=listadapterName
//
//        searchVies.setOnQueryTextListener(object:SearchView.OnQueryTextListener {
//         override   fun onQueryTextSubmit(qury:String):Boolean{
//                if(listNam.contains<Any?>(qury)) {
//                    listadapterName.filter.filter(qury)
//                }
//                else {
//                        Toast.makeText(this@MainActivity,"no items found", Toast.LENGTH_SHORT).show()
//                    }
//                return false
//            }
//           override fun onQueryTextChange(newTex:String?):Boolean{
//                listadapterName.filter.filter(newTex)
//                return false
//            }
//        })
//    }
//}
//
//
//



package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var listvew: ListView

    lateinit var listAdapter_Name: ArrayAdapter<Any>

//    lateinit var arrayList_items: ArrayList<String>;

    lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listvew = findViewById(R.id.list_id)
        searchView = findViewById(R.id.search_id)

        var a= listOf<Any>("a","b","c","d","d","e","f","g","h","jk","JK","Jkl",1,2,3,4,5,6,2.5,5.6,2.0,"apple")
//        arrayList_items = ArrayList()
//        arrayList_items.add("C")
//        arrayList_items.add("C#")
//        arrayList_items.add("Java")
//        arrayList_items.add("Javascript")
//        arrayList_items.add("Python")
//        arrayList_items.add("Dart")
//        arrayList_items.add("Kotlin")
//        arrayList_items.add("Typescript")


      //  listAdapter_Name = ArrayAdapter<Any>( this,android.R.layout.simple_list_item_1,arrayList_items
      listAdapter_Name= ArrayAdapter<Any>(this, android.R.layout.simple_list_item_1,a)


        listvew.adapter = listAdapter_Name

        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener {
             override fun onQueryTextSubmit(query: String?): Boolean {

                if (a.contains<Any?>(query)) {
                    startActivity(Intent(applicationContext,MainActivity2::class.java))
                    listAdapter_Name.filter.filter(query)

                } else {

                    Toast.makeText(this@MainActivity, "No item found..", Toast.LENGTH_LONG).show()
                }
                return false
            }

             override fun onQueryTextChange(newText: String?): Boolean {
                listAdapter_Name.filter.filter(newText)
                return false
            }
        })
    }
}

