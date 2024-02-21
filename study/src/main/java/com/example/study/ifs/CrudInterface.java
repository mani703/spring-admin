package com.example.study.ifs;

import com.example.study.model.network.Header;

public interface CrudInterface<Req, Res> {

    Header<Res> create(Req request);

    Header<Res> read(Long id);

    Header<Res> update(Req request);

    Header<Res> delete(Long id);
}
