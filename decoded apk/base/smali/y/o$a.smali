.class Ly/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/o;->i(Ly/f0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ly/f0;

.field final synthetic b:Ly/o;


# direct methods
.method constructor <init>(Ly/o;Ly/f0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly/o$a;->b:Ly/o;

    iput-object p2, p0, Ly/o$a;->a:Ly/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object p1, p0, Ly/o$a;->a:Ly/f0;

    iget-object v0, p0, Ly/o$a;->b:Ly/o;

    iget-object v1, v0, Ly/o;->b:Ly/f0;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    iput-object p1, v0, Ly/o;->b:Ly/f0;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ly/o$a;->b(Ljava/lang/Void;)V

    return-void
.end method
