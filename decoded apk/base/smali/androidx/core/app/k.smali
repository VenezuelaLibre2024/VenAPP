.class public Landroidx/core/app/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/k$a;,
        Landroidx/core/app/k$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/core/app/k$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/core/app/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/core/app/k$a;

    invoke-direct {v0, p1}, Landroidx/core/app/k$a;-><init>(I)V

    iput-object v0, p0, Landroidx/core/app/k;->a:Landroidx/core/app/k$b;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/app/k;->a:Landroidx/core/app/k$b;

    invoke-virtual {v0, p1}, Landroidx/core/app/k$b;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public b()[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/k;->a:Landroidx/core/app/k$b;

    invoke-virtual {v0}, Landroidx/core/app/k$b;->b()[Landroid/util/SparseIntArray;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/k;->a:Landroidx/core/app/k$b;

    invoke-virtual {v0, p1}, Landroidx/core/app/k$b;->c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;

    move-result-object p1

    return-object p1
.end method

.method public d()[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/k;->a:Landroidx/core/app/k$b;

    invoke-virtual {v0}, Landroidx/core/app/k$b;->d()[Landroid/util/SparseIntArray;

    move-result-object v0

    return-object v0
.end method
