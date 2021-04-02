let k = ' '

for(let x=0; x<10; x++)
{
    for(let y=15; y>x; y--){
        k+=' '
    }
        
    for(let z=0; z<2*x-1; z++){
        k+='*';
    }
    k+='\n'
}
console.log(k)
    