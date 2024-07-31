.class public interface abstract Lb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/b$b;,
        Lb/b$a;
    }
.end annotation


# static fields
.field public static final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$customtabs$ICustomTabsService"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb/b;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract C1(Lb/a;ILandroid/net/Uri;Landroid/os/Bundle;)Z
.end method

.method public abstract M(Lb/a;Landroid/os/IBinder;Landroid/os/Bundle;)Z
.end method

.method public abstract U0(Lb/a;Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a;",
            "Landroid/net/Uri;",
            "Landroid/os/Bundle;",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract W(Lb/a;Landroid/os/Bundle;)Z
.end method

.method public abstract Z(Lb/a;Landroid/os/Bundle;)Z
.end method

.method public abstract b1(J)Z
.end method

.method public abstract h1(Lb/a;)Z
.end method

.method public abstract j(Lb/a;Landroid/net/Uri;Landroid/os/Bundle;)Z
.end method

.method public abstract m(Lb/a;Ljava/lang/String;Landroid/os/Bundle;)I
.end method

.method public abstract q1(Lb/a;Landroid/net/Uri;)Z
.end method

.method public abstract y1(Lb/a;Landroid/os/Bundle;)Z
.end method
