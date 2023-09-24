package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var expressionTV:TextView
    private lateinit var resultTV:TextView
    private lateinit var clearBtn:Button
    private lateinit var openingBracketBtn:Button
    private lateinit var closingBracketBtn:Button
    private lateinit var divisionBtn:Button
    private lateinit var sevenBtn:Button
    private lateinit var eightBtn:Button
    private lateinit var nineBtn:Button
    private lateinit var multiplyBtn:Button
    private lateinit var fourBtn:Button
    private lateinit var fiveBtn:Button
    private lateinit var sixBtn:Button
    private lateinit var minusBtn:Button
    private lateinit var oneBtn:Button
    private lateinit var twoBtn:Button
    private lateinit var threeBtn:Button
    private lateinit var plusBtn:Button
    private lateinit var zeroBtn:Button
    private lateinit var pointBtn:Button
    private lateinit var backSpace:Button
    private lateinit var equalBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expressionTV = findViewById(R.id.expressionTV)
        resultTV = findViewById(R.id.resultTV)

        clearBtn = findViewById(R.id.clearBtn)
        openingBracketBtn = findViewById(R.id.openingBracketBtn)
        closingBracketBtn = findViewById(R.id.closingBracketBtn)
        divisionBtn = findViewById(R.id.divisionBtn)
        sevenBtn = findViewById(R.id.sevenBtn)
        eightBtn = findViewById(R.id.eightBtn)
        nineBtn = findViewById(R.id.nineBtn)
        multiplyBtn = findViewById(R.id.multiplyBtn)
        fourBtn = findViewById(R.id.fourBtn)
        fiveBtn = findViewById(R.id.fiveBtn)
        sixBtn = findViewById(R.id.sixBtn)
        minusBtn = findViewById(R.id.minusBtn)
        oneBtn = findViewById(R.id.oneBtn)
        twoBtn = findViewById(R.id.twoBtn)
        threeBtn = findViewById(R.id.threeBtn)
        plusBtn = findViewById(R.id.plusBtn)
        zeroBtn = findViewById(R.id.zeroBtn)
        pointBtn = findViewById(R.id.pointBtn)
        backSpace = findViewById(R.id.backSpaceBtn)
        equalBtn = findViewById(R.id.equalBtn)

        expressionTV.movementMethod = ScrollingMovementMethod()
        expressionTV.isActivated = true
        expressionTV.isPressed = true

        var str:String


        clearBtn.setOnClickListener {
            expressionText("0")
            expressionTV.textSize = 60F
            resultTV.textSize = 30F
            resultText()

        }
        openingBracketBtn.setOnClickListener {
            if (expressionTV.text.toString().endsWith("%")||expressionTV.text.toString().endsWith("/")||expressionTV.text.toString().endsWith("*")||expressionTV.text.toString().endsWith("+")||expressionTV.text.toString().endsWith("-")||expressionTV.text.toString().endsWith(".")||expressionTV.text.toString().endsWith(")")||expressionTV.text.toString().endsWith("(")){
                str = expressionTV.text.toString()
                expressionText(str)
            }
            else{
                str = expressionTV.text.toString() + "("
                expressionText(str)
            }

        }
        closingBracketBtn.setOnClickListener {
            if (expressionTV.text.toString().endsWith("%")||expressionTV.text.toString().endsWith("/")||expressionTV.text.toString().endsWith("*")||expressionTV.text.toString().endsWith("+")||expressionTV.text.toString().endsWith("-")||expressionTV.text.toString().endsWith(".")||expressionTV.text.toString().endsWith(")")||expressionTV.text.toString().endsWith("(")){
                str = expressionTV.text.toString()
                expressionText(str)
            }
            else{
                str = expressionTV.text.toString() + ")"
                expressionText(str)
            }

        }
        divisionBtn.setOnClickListener {
            if (expressionTV.text.toString().endsWith("%")||expressionTV.text.toString().endsWith("/")||expressionTV.text.toString().endsWith("*")||expressionTV.text.toString().endsWith("+")||expressionTV.text.toString().endsWith("-")||expressionTV.text.toString().endsWith(".")||expressionTV.text.toString().endsWith(")")||expressionTV.text.toString().endsWith("(")){
                str = expressionTV.text.toString()
                expressionText(str)
            }
            else{
                str = expressionTV.text.toString() + "/"
                expressionText(str)
            }

        }
        sevenBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"7"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"7"
                expressionText(str)
                resultText()
            }

        }
        eightBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"8"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"8"
                expressionText(str)
                resultText()
            }

        }
        nineBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"9"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"9"
                expressionText(str)
                resultText()
            }

        }
        multiplyBtn.setOnClickListener {
            if (expressionTV.text.toString().endsWith("%")||expressionTV.text.toString().endsWith("/")||expressionTV.text.toString().endsWith("*")||expressionTV.text.toString().endsWith("+")||expressionTV.text.toString().endsWith("-")||expressionTV.text.toString().endsWith(".")||expressionTV.text.toString().endsWith(")")||expressionTV.text.toString().endsWith("(")){
                str = expressionTV.text.toString()
                expressionText(str)
            }
            else{
                str = expressionTV.text.toString() + "*"
                expressionText(str)
            }

        }
        fourBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"4"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"4"
                expressionText(str)
                resultText()
            }

        }
        fiveBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"5"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"5"
                expressionText(str)
                resultText()
            }

        }
        sixBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"6"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"6"
                expressionText(str)
                resultText()
            }

        }
        minusBtn.setOnClickListener {
            if (expressionTV.text.toString().endsWith("%")||expressionTV.text.toString().endsWith("/")||expressionTV.text.toString().endsWith("*")||expressionTV.text.toString().endsWith("+")||expressionTV.text.toString().endsWith("-")||expressionTV.text.toString().endsWith(".")||expressionTV.text.toString().endsWith(")")||expressionTV.text.toString().endsWith("(")){
                str = expressionTV.text.toString()
                expressionText(str)
            }
            else{
                str = expressionTV.text.toString() + "-"
                expressionText(str)
            }

        }
        oneBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"1"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"1"
                expressionText(str)
                resultText()
            }

        }
        twoBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"2"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"2"
                expressionText(str)
                resultText()
            }

        }
        threeBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"3"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"3"
                expressionText(str)
                resultText()
            }

        }
        plusBtn.setOnClickListener {
            if (expressionTV.text.toString().endsWith("%")||expressionTV.text.toString().endsWith("/")||expressionTV.text.toString().endsWith("*")||expressionTV.text.toString().endsWith("+")||expressionTV.text.toString().endsWith("-")||expressionTV.text.toString().endsWith(".")||expressionTV.text.toString().endsWith(")")||expressionTV.text.toString().endsWith("(")){
                str = expressionTV.text.toString()
                expressionText(str)
            }
            else{
                str = expressionTV.text.toString() + "+"
                expressionText(str)
            }

        }
        zeroBtn.setOnClickListener {
            if (expressionTV.text.toString().startsWith("0")){
                str = expressionTV.text.toString().replace("0","")+"0"
                expressionText(str)
                resultText()
            }
            else{
                str = expressionTV.text.toString()+"0"
                expressionText(str)
                resultText()
            }

        }
        pointBtn.setOnClickListener {
            if (expressionTV.text.toString().endsWith("%")||expressionTV.text.toString().endsWith("/")||expressionTV.text.toString().endsWith("*")||expressionTV.text.toString().endsWith("+")||expressionTV.text.toString().endsWith("-")||expressionTV.text.toString().endsWith(".")||expressionTV.text.toString().endsWith(")")||expressionTV.text.toString().endsWith("(")){
                str = expressionTV.text.toString()
                expressionText(str)
            }
            else{
                str = expressionTV.text.toString() + "."
                expressionText(str)
            }

        }
        backSpace.setOnClickListener {
            if(expressionTV.text.toString().isNotEmpty()){
                val lastIndex = expressionTV.text.toString().lastIndex
                str = expressionTV.text.toString().substring(0,lastIndex)
                expressionText(str)
                resultText()
            }

        }
        equalBtn.setOnClickListener {
            expressionTV.textSize = 30F
            resultTV.textSize = 60F

        }

    }

    private fun expressionText(str: String){
        expressionTV.text = str
    }
    private fun resultText(){
        val exp = expressionTV.text

    }


}