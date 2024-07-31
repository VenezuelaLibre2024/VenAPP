.class public final synthetic Lzd/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lzd/q2;

.field public final synthetic b:Lde/i;


# direct methods
.method public synthetic constructor <init>(Lzd/q2;Lde/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/m2;->a:Lzd/q2;

    iput-object p2, p0, Lzd/m2;->b:Lde/i;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lzd/m2;->a:Lzd/q2;

    iget-object v1, p0, Lzd/m2;->b:Lde/i;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lzd/q2;->c(Lzd/q2;Lde/i;Ljava/lang/String;)V

    return-void
.end method
