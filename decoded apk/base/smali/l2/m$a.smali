.class Ll2/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/m;->a(Landroidx/lifecycle/LiveData;Lm/a;Lm2/b;)Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/s<",
        "TIn;>;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TOut;"
        }
    .end annotation
.end field

.field final synthetic b:Lm2/b;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lm/a;

.field final synthetic e:Landroidx/lifecycle/p;


# direct methods
.method constructor <init>(Lm2/b;Ljava/lang/Object;Lm/a;Landroidx/lifecycle/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ll2/m$a;->b:Lm2/b;

    iput-object p2, p0, Ll2/m$a;->c:Ljava/lang/Object;

    iput-object p3, p0, Ll2/m$a;->d:Lm/a;

    iput-object p4, p0, Ll2/m$a;->e:Landroidx/lifecycle/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Ll2/m$a;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TIn;)V"
        }
    .end annotation

    iget-object v0, p0, Ll2/m$a;->b:Lm2/b;

    new-instance v1, Ll2/m$a$a;

    invoke-direct {v1, p0, p1}, Ll2/m$a$a;-><init>(Ll2/m$a;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lm2/b;->c(Ljava/lang/Runnable;)V

    return-void
.end method
