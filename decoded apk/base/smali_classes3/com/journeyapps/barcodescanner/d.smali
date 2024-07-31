.class public final synthetic Lcom/journeyapps/barcodescanner/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/journeyapps/barcodescanner/e$a;

.field public final synthetic b:Lih/b;


# direct methods
.method public synthetic constructor <init>(Lcom/journeyapps/barcodescanner/e$a;Lih/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/journeyapps/barcodescanner/d;->a:Lcom/journeyapps/barcodescanner/e$a;

    iput-object p2, p0, Lcom/journeyapps/barcodescanner/d;->b:Lih/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/d;->a:Lcom/journeyapps/barcodescanner/e$a;

    iget-object v1, p0, Lcom/journeyapps/barcodescanner/d;->b:Lih/b;

    invoke-static {v0, v1}, Lcom/journeyapps/barcodescanner/e$a;->c(Lcom/journeyapps/barcodescanner/e$a;Lih/b;)V

    return-void
.end method
