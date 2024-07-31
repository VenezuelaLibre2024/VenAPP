.class public final Lbe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/r3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/d;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/q3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/d;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/d;",
            "Lbk/a<",
            "Lzd/q3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/j;->a:Lbe/d;

    iput-object p2, p0, Lbe/j;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbe/d;Lbk/a;)Lbe/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/d;",
            "Lbk/a<",
            "Lzd/q3;",
            ">;)",
            "Lbe/j;"
        }
    .end annotation

    new-instance v0, Lbe/j;

    invoke-direct {v0, p0, p1}, Lbe/j;-><init>(Lbe/d;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/d;Lzd/q3;)Lzd/r3;
    .locals 0

    invoke-virtual {p0, p1}, Lbe/d;->f(Lzd/q3;)Lzd/r3;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/r3;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/r3;
    .locals 2

    iget-object v0, p0, Lbe/j;->a:Lbe/d;

    iget-object v1, p0, Lbe/j;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/q3;

    invoke-static {v0, v1}, Lbe/j;->c(Lbe/d;Lzd/q3;)Lzd/r3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/j;->b()Lzd/r3;

    move-result-object v0

    return-object v0
.end method
