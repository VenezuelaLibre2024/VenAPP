.class public final Lbe/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/a;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcc/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/a;",
            "Lbk/a<",
            "Lcc/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/c;->a:Lbe/a;

    iput-object p2, p0, Lbe/c;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbe/a;Lbk/a;)Lbe/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/a;",
            "Lbk/a<",
            "Lcc/a;",
            ">;)",
            "Lbe/c;"
        }
    .end annotation

    new-instance v0, Lbe/c;

    invoke-direct {v0, p0, p1}, Lbe/c;-><init>(Lbe/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/a;Lcc/a;)Lzd/c;
    .locals 0

    invoke-virtual {p0, p1}, Lbe/a;->b(Lcc/a;)Lzd/c;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/c;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/c;
    .locals 2

    iget-object v0, p0, Lbe/c;->a:Lbe/a;

    iget-object v1, p0, Lbe/c;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcc/a;

    invoke-static {v0, v1}, Lbe/c;->c(Lbe/a;Lcc/a;)Lzd/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/c;->b()Lzd/c;

    move-result-object v0

    return-object v0
.end method
