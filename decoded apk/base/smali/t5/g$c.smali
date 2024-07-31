.class final Lt5/g$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/g;->l(Lb6/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lt5/g;

.field final synthetic b:Lb6/e;


# direct methods
.method constructor <init>(Lt5/g;Lb6/e;)V
    .locals 0

    iput-object p1, p0, Lt5/g$c;->a:Lt5/g;

    iput-object p2, p0, Lt5/g$c;->b:Lb6/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lt5/g$c;->a:Lt5/g;

    invoke-static {v0}, Lt5/g;->c(Lt5/g;)Lt5/b;

    move-result-object v0

    invoke-virtual {v0}, Lt5/b;->d()V

    iget-object v0, p0, Lt5/g$c;->b:Lb6/e;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt5/g$c;->a()V

    sget-object v0, Lck/v;->a:Lck/v;

    return-object v0
.end method
