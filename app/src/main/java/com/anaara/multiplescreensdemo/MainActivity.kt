package com.anaara.multiplescreensdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
//This is a comment (single line)
  /*
  This is a
  multiline comment
   */
  /**
   * This is another
   * kind of
   * multline comment
   * notice the pretty green color
   * this is a change
   *
   */


  /**
   * onCreate is called when the app is first launched.
   * @param savedInstanceState is the saved state of the application
   *
   */
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    navigateButton.setOnClickListener(this)

  }

  override fun onClick(v: View) {
    when (v.id) {
      R.id.navigateButton -> moveToNextScreen()
      else -> println("No case satisfied")
    }
  }

  private fun moveToNextScreen() {

      val nextScreenIntent = Intent(this, Screen2::class.java).apply {
          //pass some data to the next screen here if you want
      }

      startActivity(nextScreenIntent)

  }


}
