.class public final Lbe/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/r2;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/e0;


# direct methods
.method public constructor <init>(Lbe/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/g0;->a:Lbe/e0;

    return-void
.end method

.method public static a(Lbe/e0;)Lbe/g0;
    .locals 1

    new-instance v0, Lbe/g0;

    invoke-direct {v0, p0}, Lbe/g0;-><init>(Lbe/e0;)V

    return-object v0
.end method

.method public static c(Lbe/e0;)Lzd/r2;
    .locals 0

    invoke-virtual {p0}, Lbe/e0;->f()Lzd/r2;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/r2;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/r2;
    .locals 1

    iget-object v0, p0, Lbe/g0;->a:Lbe/e0;

    invoke-static {v0}, Lbe/g0;->c(Lbe/e0;)Lzd/r2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/g0;->b()Lzd/r2;

    move-result-object v0

    return-object v0
.end method
