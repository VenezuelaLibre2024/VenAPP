.class public final synthetic Lih/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lcom/journeyapps/barcodescanner/e;


# direct methods
.method public synthetic constructor <init>(Lcom/journeyapps/barcodescanner/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih/e;->a:Lcom/journeyapps/barcodescanner/e;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lih/e;->a:Lcom/journeyapps/barcodescanner/e;

    invoke-static {v0, p1}, Lcom/journeyapps/barcodescanner/e;->c(Lcom/journeyapps/barcodescanner/e;Landroid/content/DialogInterface;)V

    return-void
.end method
