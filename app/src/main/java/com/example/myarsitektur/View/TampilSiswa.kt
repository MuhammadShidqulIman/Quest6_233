package com.example.myarsitektur.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


import androidx.compose.ui.res.dimensionResource
import androidx.compose.foundation.layout.Arrangement

import com.example.myarsitektur.R
import com.example.myarsitektur.model.Siswa


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
) {

    val items = listOf(
        Pair(first = stringResource(id = R.string.nama), second = statusUiSiswa.nama),
        Pair(first = stringResource(id = R.string.gender), second = statusUiSiswa.gender),
        Pair(first = stringResource(id = R.string.alamat), second = statusUiSiswa.alamat)
    )
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.detail), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
