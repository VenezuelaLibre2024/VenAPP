.class public final Ls9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/a$d;


# static fields
.field public static final b:Ls9/c;


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v1, Ls9/c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ls9/c;-><init>(Landroid/os/Bundle;Ls9/g;)V

    sput-object v1, Ls9/c;->b:Ls9/c;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Bundle;Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/c;->a:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Ls9/c;->a:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ls9/c;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ls9/c;

    iget-object v0, p0, Ls9/c;->a:Landroid/os/Bundle;

    iget-object p1, p1, Ls9/c;->a:Landroid/os/Bundle;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/q;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Ls9/c;->a:Landroid/os/Bundle;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
