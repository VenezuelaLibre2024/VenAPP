.class public final Lyl/n;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final a:Lyl/b;


# direct methods
.method public constructor <init>(Lyl/b;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stream was reset: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lyl/n;->a:Lyl/b;

    return-void
.end method
