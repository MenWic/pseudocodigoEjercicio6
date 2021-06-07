Proceso  Ejercicio6
	Definir n, menores, mayores, numpersonasMen, numPersonasMay Como Entero
	
	menores=0
	mayores=0
	numPersonasMen=0
	numPersonasMayersonasMAy=0
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "Registro: " i ") Ingrese la edad"
		Leer n
		si n <25 Entonces
			menores = menores + n
			numPersonasMen = numPersonasMen + 1
			promed1 = menores / numPersonasMen
		FinSi
		
		si n > 25 Entonces
			mayores=mayores + n
			numPersonasMay = numPersonasMay + 1
			promed2 = mayores / numPersonasMay
		FinSi
	FinPara
	
	Escribir "El promedio de edades de las personas menores a 25 años es = " promed1 "."
	Escribir "El promedio de edades de las personas mayores a 25 años es = " promed2 "."
FinProceso

