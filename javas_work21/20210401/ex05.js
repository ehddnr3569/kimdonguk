// let example = "김두희"
// let one1 = example.charAt(0)
// let one2 = example.charAt(1)
// let one3 = example.charAt(2)
// console.log(example)
// console.log(one1)
// console.log(one2)
// console.log(one3)



let start = "1"
for (let i =0 ; i<20; i++)
{
   console.log((Number(i)+1)+"번 째 : " + start)
   let end = "" // 누적 변수
   let number = start.charAt(0) //읽을 숫자
   let count = 0  //읽은 숫자의 개수
    for(let j = 0; j<start.length; j++)
    {
        if(number != start.charAt(j))
        {
            end = end + number +count
            count =1
            number = start.charAt(j)
        }
        else
            count++
    }
    end = end + number +count;
    start = end;
}