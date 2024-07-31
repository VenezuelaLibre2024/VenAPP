.class public final Lt5/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/g;->n(Lb6/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb6/e;

.field final synthetic b:Lt5/g;

.field final synthetic c:I

.field final synthetic d:Z


# direct methods
.method constructor <init>(Lb6/e;Lt5/g;IZ)V
    .locals 0

    iput-object p1, p0, Lt5/g$e;->a:Lb6/e;

    iput-object p2, p0, Lt5/g$e;->b:Lt5/g;

    iput p3, p0, Lt5/g$e;->c:I

    iput-boolean p4, p0, Lt5/g$e;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "needPermissions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lt5/g$e;->a:Lb6/e;

    sget-object v0, Lv5/c;->Authorized:Lv5/c;

    invoke-virtual {v0}, Lv5/c;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "deniedPermissions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "grantedPermissions"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "needPermissions"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lt5/g$e;->b:Lt5/g;

    invoke-static {p1}, Lt5/g;->b(Lt5/g;)Ly5/c;

    move-result-object p1

    iget p2, p0, Lt5/g$e;->c:I

    iget-boolean p3, p0, Lt5/g$e;->d:Z

    invoke-virtual {p1, p2, p3}, Ly5/c;->d(IZ)Lv5/c;

    move-result-object p1

    iget-object p2, p0, Lt5/g$e;->a:Lb6/e;

    invoke-virtual {p1}, Lv5/c;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method
