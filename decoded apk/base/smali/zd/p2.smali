.class public final synthetic Lzd/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lzd/q2;

.field public final synthetic b:Lde/i;

.field public final synthetic c:Lqd/t$b;


# direct methods
.method public synthetic constructor <init>(Lzd/q2;Lde/i;Lqd/t$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/p2;->a:Lzd/q2;

    iput-object p2, p0, Lzd/p2;->b:Lde/i;

    iput-object p3, p0, Lzd/p2;->c:Lqd/t$b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lzd/p2;->a:Lzd/q2;

    iget-object v1, p0, Lzd/p2;->b:Lde/i;

    iget-object v2, p0, Lzd/p2;->c:Lqd/t$b;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lzd/q2;->b(Lzd/q2;Lde/i;Lqd/t$b;Ljava/lang/String;)V

    return-void
.end method
