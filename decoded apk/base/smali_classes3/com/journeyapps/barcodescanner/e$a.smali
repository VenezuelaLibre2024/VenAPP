.class Lcom/journeyapps/barcodescanner/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lih/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/journeyapps/barcodescanner/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/journeyapps/barcodescanner/e;


# direct methods
.method constructor <init>(Lcom/journeyapps/barcodescanner/e;)V
    .locals 0

    iput-object p1, p0, Lcom/journeyapps/barcodescanner/e$a;->a:Lcom/journeyapps/barcodescanner/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lcom/journeyapps/barcodescanner/e$a;Lih/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/journeyapps/barcodescanner/e$a;->d(Lih/b;)V

    return-void
.end method

.method private synthetic d(Lih/b;)V
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/e$a;->a:Lcom/journeyapps/barcodescanner/e;

    invoke-virtual {v0, p1}, Lcom/journeyapps/barcodescanner/e;->B(Lih/b;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldg/s;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public b(Lih/b;)V
    .locals 2

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/e$a;->a:Lcom/journeyapps/barcodescanner/e;

    invoke-static {v0}, Lcom/journeyapps/barcodescanner/e;->d(Lcom/journeyapps/barcodescanner/e;)Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->e()V

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/e$a;->a:Lcom/journeyapps/barcodescanner/e;

    invoke-static {v0}, Lcom/journeyapps/barcodescanner/e;->e(Lcom/journeyapps/barcodescanner/e;)Lig/e;

    move-result-object v0

    invoke-virtual {v0}, Lig/e;->f()V

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/e$a;->a:Lcom/journeyapps/barcodescanner/e;

    invoke-static {v0}, Lcom/journeyapps/barcodescanner/e;->f(Lcom/journeyapps/barcodescanner/e;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/journeyapps/barcodescanner/d;

    invoke-direct {v1, p0, p1}, Lcom/journeyapps/barcodescanner/d;-><init>(Lcom/journeyapps/barcodescanner/e$a;Lih/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
