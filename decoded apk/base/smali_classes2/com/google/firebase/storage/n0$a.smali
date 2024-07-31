.class Lcom/google/firebase/storage/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/storage/n0;->U()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhf/e;

.field final synthetic b:Lcom/google/firebase/storage/n0;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/n0;Lhf/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/n0$a;->b:Lcom/google/firebase/storage/n0;

    iput-object p2, p0, Lcom/google/firebase/storage/n0$a;->a:Lhf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/storage/n0$a;->a:Lhf/e;

    iget-object v1, p0, Lcom/google/firebase/storage/n0$a;->b:Lcom/google/firebase/storage/n0;

    invoke-static {v1}, Lcom/google/firebase/storage/n0;->l0(Lcom/google/firebase/storage/n0;)Loc/b;

    move-result-object v1

    invoke-static {v1}, Lgf/i;->c(Loc/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/n0$a;->b:Lcom/google/firebase/storage/n0;

    invoke-static {v2}, Lcom/google/firebase/storage/n0;->m0(Lcom/google/firebase/storage/n0;)Ljc/b;

    move-result-object v2

    invoke-static {v2}, Lgf/i;->b(Ljc/b;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/n0$a;->b:Lcom/google/firebase/storage/n0;

    invoke-static {v3}, Lcom/google/firebase/storage/n0;->n0(Lcom/google/firebase/storage/n0;)Lcom/google/firebase/storage/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v3

    invoke-virtual {v3}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lhf/e;->B(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method
