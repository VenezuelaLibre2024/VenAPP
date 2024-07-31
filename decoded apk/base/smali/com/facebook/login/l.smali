.class public final synthetic Lcom/facebook/login/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/facebook/login/m;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/l;->a:Lcom/facebook/login/m;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->a:Lcom/facebook/login/m;

    invoke-static {v0, p1, p2}, Lcom/facebook/login/m;->v(Lcom/facebook/login/m;Landroid/content/DialogInterface;I)V

    return-void
.end method
