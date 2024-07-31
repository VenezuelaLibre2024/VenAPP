.class public Lbe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lzd/c;)Lij/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzd/c;",
            ")",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lzd/c;->d()Lij/a;

    move-result-object p1

    return-object p1
.end method

.method b(Lcc/a;)Lzd/c;
    .locals 1

    new-instance v0, Lzd/c;

    invoke-direct {v0, p1}, Lzd/c;-><init>(Lcc/a;)V

    return-object v0
.end method
