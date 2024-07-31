.class public final Lbe/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/u2;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/h0;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/h0;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/h0;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/i0;->a:Lbe/h0;

    iput-object p2, p0, Lbe/i0;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbe/h0;Lbk/a;)Lbe/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/h0;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)",
            "Lbe/i0;"
        }
    .end annotation

    new-instance v0, Lbe/i0;

    invoke-direct {v0, p0, p1}, Lbe/i0;-><init>(Lbe/h0;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/h0;Landroid/app/Application;)Lzd/u2;
    .locals 0

    invoke-virtual {p0, p1}, Lbe/h0;->a(Landroid/app/Application;)Lzd/u2;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/u2;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/u2;
    .locals 2

    iget-object v0, p0, Lbe/i0;->a:Lbe/h0;

    iget-object v1, p0, Lbe/i0;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-static {v0, v1}, Lbe/i0;->c(Lbe/h0;Landroid/app/Application;)Lzd/u2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/i0;->b()Lzd/u2;

    move-result-object v0

    return-object v0
.end method
