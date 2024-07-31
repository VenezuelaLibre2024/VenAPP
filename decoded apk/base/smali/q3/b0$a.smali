.class Lq3/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lq3/z;

.field private final b:Lc4/d;


# direct methods
.method constructor <init>(Lq3/z;Lc4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/b0$a;->a:Lq3/z;

    iput-object p2, p0, Lq3/b0$a;->b:Lc4/d;

    return-void
.end method


# virtual methods
.method public a(Lk3/d;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lq3/b0$a;->b:Lc4/d;

    invoke-virtual {v0}, Lc4/d;->a()Ljava/io/IOException;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Lk3/d;->c(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lq3/b0$a;->a:Lq3/z;

    invoke-virtual {v0}, Lq3/z;->b()V

    return-void
.end method
