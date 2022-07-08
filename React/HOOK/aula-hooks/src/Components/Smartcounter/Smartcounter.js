import {useState} from 'react';

function SmartCounter () {

    const [quantity, upQuantity] = useState(1);
    
    return (
        <>
            <h1>{quantity}</h1>
            <button onClick={()=> upQuantity(quantity + 1)}>Aumenta</button>
        </>
    )
}
export default SmartCounter;
// Isso é um hook
// conseguimos componentes com estado
// Retorna um vetor
// 1. Variável statefull
// 2. Uma função amarrada a essa variável que atualiza esse valor