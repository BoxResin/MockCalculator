package boxresin.tmp.mockcalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import boxresin.tmp.lib.mockmath.maxN
import boxresin.tmp.lib.mockmath.minN
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		text.text = "${maxN(7, 3, 6, 10, 4, 1)}\n${minN(7, 3, 6, 10, 4, 1)}"
	}
}
