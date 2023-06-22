package dev.minjae.josaextension

import org.junit.jupiter.api.Test

class JosaTest {

    @Test
    fun `을를 Test`() {
        assert("'%s'는 사용중인 닉네임 입니다.".josa("닉네임") == "'닉네임'은 사용중인 닉네임 입니다.")
        assert("'%s'는 사용중이고 '%s'는 사용중이지 않은 닉네임입니다.".josa("닉네임", "닉네임2") == "'닉네임'은 사용중이고 '닉네임2'는 사용중이지 않은 닉네임입니다.")
        assert("'%s'는 비싸요".josa(10) == "'10'은 비싸요")
    }

    @Test
    fun `으로 Test`() {
        assert("%s으로 가보자!".josa("계곡") == "계곡으로 가보자!")
        assert("%s으로 가보자!".josa("서울") == "서울로 가보자!")
    }

    @Test
    fun `이가 Test`() {
        assert("%s가 좋아요".josa("코틀린") == "코틀린이 좋아요")
        assert("%s가 좋아요".josa("자바") == "자바가 좋아요")
    }
}
