.class public final synthetic Lcom/facebook/login/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/facebook/login/m;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/facebook/login/m$b;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/Date;

.field public final synthetic f:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/m;Ljava/lang/String;Lcom/facebook/login/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/k;->a:Lcom/facebook/login/m;

    iput-object p2, p0, Lcom/facebook/login/k;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/login/k;->c:Lcom/facebook/login/m$b;

    iput-object p4, p0, Lcom/facebook/login/k;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/facebook/login/k;->e:Ljava/util/Date;

    iput-object p6, p0, Lcom/facebook/login/k;->f:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget-object v0, p0, Lcom/facebook/login/k;->a:Lcom/facebook/login/m;

    iget-object v1, p0, Lcom/facebook/login/k;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/login/k;->c:Lcom/facebook/login/m$b;

    iget-object v3, p0, Lcom/facebook/login/k;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/login/k;->e:Ljava/util/Date;

    iget-object v5, p0, Lcom/facebook/login/k;->f:Ljava/util/Date;

    move-object v6, p1

    move v7, p2

    invoke-static/range {v0 .. v7}, Lcom/facebook/login/m;->t(Lcom/facebook/login/m;Ljava/lang/String;Lcom/facebook/login/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Landroid/content/DialogInterface;I)V

    return-void
.end method
