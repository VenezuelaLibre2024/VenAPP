.class public final synthetic Li0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/d$a;


# instance fields
.field public final synthetic a:Li0/d;


# direct methods
.method public synthetic constructor <init>(Li0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/c;->a:Li0/d;

    return-void
.end method


# virtual methods
.method public final a(II)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Li0/c;->a:Li0/d;

    invoke-static {v0, p1, p2}, Li0/d;->V(Li0/d;II)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
