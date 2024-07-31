.class public final Lzd/n3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/m3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/u2;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lce/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/u2;",
            ">;",
            "Lbk/a<",
            "Lce/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/n3;->a:Lbk/a;

    iput-object p2, p0, Lzd/n3;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;)Lzd/n3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/u2;",
            ">;",
            "Lbk/a<",
            "Lce/a;",
            ">;)",
            "Lzd/n3;"
        }
    .end annotation

    new-instance v0, Lzd/n3;

    invoke-direct {v0, p0, p1}, Lzd/n3;-><init>(Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lzd/u2;Lce/a;)Lzd/m3;
    .locals 1

    new-instance v0, Lzd/m3;

    invoke-direct {v0, p0, p1}, Lzd/m3;-><init>(Lzd/u2;Lce/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzd/m3;
    .locals 2

    iget-object v0, p0, Lzd/n3;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzd/u2;

    iget-object v1, p0, Lzd/n3;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lce/a;

    invoke-static {v0, v1}, Lzd/n3;->c(Lzd/u2;Lce/a;)Lzd/m3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzd/n3;->b()Lzd/m3;

    move-result-object v0

    return-object v0
.end method
