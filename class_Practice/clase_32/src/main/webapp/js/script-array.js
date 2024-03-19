var arreglo = ['a', 20, 'C', 30.5];
console.log(arreglo);

///--------------------------
/// Funciones para trabajar al final del arreglo
///--------------------------

/// Agregar un elemento
arreglo.push('G');

/// Eliminar un elemento
arreglo.pop();

/// -------------------------
/// Funciones para trabajar al inicio del arreglo
/// -------------------------

/// Agregar un elemento 
arreglo.unshift('J');

/// Eliminar un elemento
arreglo.shift();

/// -------------------------
/// Funciones para trabajar con valores intermedios
/// -------------------------

var a = [1, 2, 3, 4, 5, 6, 7];
var eliminados = a.splice(1, 2); // eliminados = [2,3] / a = [1,4,5]
console.log('Array a: ' + a);
console.log("Arrays eliminados: " + eliminados);

/// -------------------------

a = [1, 2, 3, 4, 5];
a.splice(2, 0, 'a'); // -> [1,2,'a',3,4,5]
console.log("Agrego al array un elemento en posicio 2: " + a);

/// -------------------------
a = [1, 2, 3, 4, 5];
a.splice(3,2,"Hola mundo",new Date());
console.log(a);