.class final Lx0/m$r;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/m;->z(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.datastore.core.SingleProcessDataStore"
    f = "SingleProcessDataStore.kt"
    l = {
        0x1aa
    }
    m = "writeData$datastore_core"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field synthetic f:Ljava/lang/Object;

.field final synthetic r:Lx0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field s:I


# direct methods
.method constructor <init>(Lx0/m;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/m<",
            "TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lx0/m$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx0/m$r;->r:Lx0/m;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx0/m$r;->f:Ljava/lang/Object;

    iget p1, p0, Lx0/m$r;->s:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx0/m$r;->s:I

    iget-object p1, p0, Lx0/m$r;->r:Lx0/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lx0/m;->z(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
