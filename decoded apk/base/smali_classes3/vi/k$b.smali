.class public final Lvi/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/k$b$a;
    }
.end annotation


# instance fields
.field private final a:Lvi/c;

.field private final b:I

.field private final c:Z


# direct methods
.method constructor <init>(Lvi/c;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "callOptions"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/c;

    iput-object p1, p0, Lvi/k$b;->a:Lvi/c;

    iput p2, p0, Lvi/k$b;->b:I

    iput-boolean p3, p0, Lvi/k$b;->c:Z

    return-void
.end method

.method public static a()Lvi/k$b$a;
    .locals 1

    new-instance v0, Lvi/k$b$a;

    invoke-direct {v0}, Lvi/k$b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "callOptions"

    iget-object v2, p0, Lvi/k$b;->a:Lvi/c;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "previousAttempts"

    iget v2, p0, Lvi/k$b;->b:I

    invoke-virtual {v0, v1, v2}, Leb/i$b;->b(Ljava/lang/String;I)Leb/i$b;

    move-result-object v0

    const-string v1, "isTransparentRetry"

    iget-boolean v2, p0, Lvi/k$b;->c:Z

    invoke-virtual {v0, v1, v2}, Leb/i$b;->e(Ljava/lang/String;Z)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
