.class Lo0/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ln0/e;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field final synthetic h:Lo0/o;


# direct methods
.method public constructor <init>(Lo0/o;Ln0/e;Lk0/d;I)V
    .locals 0

    iput-object p1, p0, Lo0/o$a;->h:Lo0/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lo0/o$a;->a:Ljava/lang/ref/WeakReference;

    iget-object p1, p2, Ln0/e;->O:Ln0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lo0/o$a;->b:I

    iget-object p1, p2, Ln0/e;->P:Ln0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lo0/o$a;->c:I

    iget-object p1, p2, Ln0/e;->Q:Ln0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lo0/o$a;->d:I

    iget-object p1, p2, Ln0/e;->R:Ln0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lo0/o$a;->e:I

    iget-object p1, p2, Ln0/e;->S:Ln0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lo0/o$a;->f:I

    iput p4, p0, Lo0/o$a;->g:I

    return-void
.end method
