.class public final Lzd/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/v2;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/w2;->a:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;)Lzd/w2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)",
            "Lzd/w2;"
        }
    .end annotation

    new-instance v0, Lzd/w2;

    invoke-direct {v0, p0}, Lzd/w2;-><init>(Lbk/a;)V

    return-object v0
.end method

.method public static c(Landroid/app/Application;)Lzd/v2;
    .locals 1

    new-instance v0, Lzd/v2;

    invoke-direct {v0, p0}, Lzd/v2;-><init>(Landroid/app/Application;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzd/v2;
    .locals 1

    iget-object v0, p0, Lzd/w2;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lzd/w2;->c(Landroid/app/Application;)Lzd/v2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzd/w2;->b()Lzd/v2;

    move-result-object v0

    return-object v0
.end method
