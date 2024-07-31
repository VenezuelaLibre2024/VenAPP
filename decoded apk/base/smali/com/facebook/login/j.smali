.class public final synthetic Lcom/facebook/login/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/i0$b;


# instance fields
.field public final synthetic a:Lcom/facebook/login/m;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Date;

.field public final synthetic d:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/login/m;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/j;->a:Lcom/facebook/login/m;

    iput-object p2, p0, Lcom/facebook/login/j;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/login/j;->c:Ljava/util/Date;

    iput-object p4, p0, Lcom/facebook/login/j;->d:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final b(Li4/n0;)V
    .locals 4

    iget-object v0, p0, Lcom/facebook/login/j;->a:Lcom/facebook/login/m;

    iget-object v1, p0, Lcom/facebook/login/j;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/login/j;->c:Ljava/util/Date;

    iget-object v3, p0, Lcom/facebook/login/j;->d:Ljava/util/Date;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/facebook/login/m;->q(Lcom/facebook/login/m;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Li4/n0;)V

    return-void
.end method
