import React, {useState, useEffect} from 'react';
import '../Ifoodcounter/Ifoodcounterr.css';

export default function ifoodcounter() {

    const [value, setValue] = useState (1)
    
    const[buttonStyle, setButtonStyle]=useState("counter-button-minus-active")

    useEffect(()=>{
      document.getElementsById("moeda").innerHTML= 2 * value
    }, [value])

    function down (){
      if (value <= 1){
        setButtonStyle("counter-button-minus-desactive")
        //muda o estado via css
      }
      if (value > 0){
        setValue(value - 1)
      }
    }

    function up (){
      setValue(value + 1)
      setButtonStyle("counter-button-minus-active")
    }

  return (
    <div className='countex-wrapper'>
        <button className={buttonStyle}
        onClick={down}
        >
            -
        </button>
        <p>{value}</p>
        <button className='counter-button-plus-active'
        onClick={up}
        >
            +
        </button>
        <button id='moeda'>12,00</button>

    </div>
  )
}
