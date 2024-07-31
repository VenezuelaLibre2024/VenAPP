.class public abstract Lvi/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lvi/t0<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Lvi/t0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lvi/t0<",
            "*>;"
        }
    .end annotation

    invoke-static {}, Lvi/u0;->d()Lvi/u0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/u0;->a(Ljava/lang/String;)Lvi/t0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a()Lvi/s0;
.end method
