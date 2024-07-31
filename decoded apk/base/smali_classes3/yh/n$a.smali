.class Lyh/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyh/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyh/n;->c(Lyh/i;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lyh/i;

.field final synthetic b:Lyh/n;


# direct methods
.method constructor <init>(Lyh/n;Lyh/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lyh/n$a;->b:Lyh/n;

    iput-object p2, p0, Lyh/n$a;->a:Lyh/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lyh/n$a;->a:Lyh/i;

    iget v0, v0, Lyh/i;->c:I

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lyh/n$a;->a:Lyh/i;

    invoke-virtual {v0}, Lyh/i;->F()Z

    move-result v0

    return v0
.end method
