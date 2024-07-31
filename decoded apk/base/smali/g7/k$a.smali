.class final Lg7/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:Lg7/o;

.field public final b:Lg7/r;

.field public final c:Ly6/b0;

.field public final d:Ly6/c0;

.field public e:I


# direct methods
.method public constructor <init>(Lg7/o;Lg7/r;Ly6/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/k$a;->a:Lg7/o;

    iput-object p2, p0, Lg7/k$a;->b:Lg7/r;

    iput-object p3, p0, Lg7/k$a;->c:Ly6/b0;

    iget-object p1, p1, Lg7/o;->f:Lt6/u1;

    iget-object p1, p1, Lt6/u1;->w:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ly6/c0;

    invoke-direct {p1}, Ly6/c0;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lg7/k$a;->d:Ly6/c0;

    return-void
.end method
