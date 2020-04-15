package service;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CaixaServiceTest {

    @Test
    public void deve_retornar_nota_de_100_se_sacar_100_reais() {
        CaixaService service = new CaixaService();

        int[] resultadoEsperado = new int[]{1, 0, 0, 0};
        int[] resultado = service.sacarDinheiro(100);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deve_retornar_nota_de_50_se_sacar_50_reais() {
        CaixaService service = new CaixaService();

        int[] resultadoEsperado = new int[]{0, 1, 0, 0};
        int[] resultado = service.sacarDinheiro(50);

        assertArrayEquals(resultadoEsperado, resultado);

    }

    @Test
    public void deve_retornar_nota_de_20_se_sacar_20_reais() {
        CaixaService service = new CaixaService();

        int[] resultadoEsperado = new int[]{0, 0, 1, 0};
        int[] resultado = service.sacarDinheiro(20);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deve_retornar_nota_de_10_se_sacar_10_reais() {
        CaixaService service = new CaixaService();

        int[] resultadoEsperado = new int[]{0, 0, 0, 1};
        int[] resultado = service.sacarDinheiro(10);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deve_retornar_9_nota_de_100_1_nota_de_50_2_nota_de_20_se_sacar_999_reais() {
        CaixaService service = new CaixaService();

        int[] resultadoEsperado = new int[]{9, 1, 2, 0};
        int[] resultado = service.sacarDinheiro(999);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deve_retornar_2_nota_de_100_1_nota_de_50_se_sacar_251_reais() {
        CaixaService service = new CaixaService();

        int[] resultadoEsperado = new int[]{2, 1, 0, 0};
        int[] resultado = service.sacarDinheiro(251);

        assertArrayEquals(resultadoEsperado, resultado);
    }


}
