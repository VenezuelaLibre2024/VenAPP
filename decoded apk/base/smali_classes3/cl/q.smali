.class public final Lcl/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcl/c<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Throwable;


# virtual methods
.method public emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lcl/q;->a:Ljava/lang/Throwable;

    throw p1
.end method
