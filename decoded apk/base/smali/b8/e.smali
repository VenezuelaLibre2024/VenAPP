.class public final Lb8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/k;


# instance fields
.field private final a:Lb8/k;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu7/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb8/k;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/k;",
            "Ljava/util/List<",
            "Lu7/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/e;->a:Lb8/k;

    iput-object p2, p0, Lb8/e;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lb8/h;Lb8/g;)Ls8/g0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/h;",
            "Lb8/g;",
            ")",
            "Ls8/g0$a<",
            "Lb8/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lu7/b;

    iget-object v1, p0, Lb8/e;->a:Lb8/k;

    invoke-interface {v1, p1, p2}, Lb8/k;->a(Lb8/h;Lb8/g;)Ls8/g0$a;

    move-result-object p1

    iget-object p2, p0, Lb8/e;->b:Ljava/util/List;

    invoke-direct {v0, p1, p2}, Lu7/b;-><init>(Ls8/g0$a;Ljava/util/List;)V

    return-object v0
.end method

.method public b()Ls8/g0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls8/g0$a<",
            "Lb8/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lu7/b;

    iget-object v1, p0, Lb8/e;->a:Lb8/k;

    invoke-interface {v1}, Lb8/k;->b()Ls8/g0$a;

    move-result-object v1

    iget-object v2, p0, Lb8/e;->b:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lu7/b;-><init>(Ls8/g0$a;Ljava/util/List;)V

    return-object v0
.end method
