.class public interface abstract Lb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a$b;,
        Lb/a$a;
    }
.end annotation


# static fields
.field public static final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$customtabs$ICustomTabsCallback"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb/a;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

.method public abstract H1(ILandroid/os/Bundle;)V
.end method

.method public abstract V(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract V1(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract X1(Landroid/os/Bundle;)V
.end method

.method public abstract Z1(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end method

.method public abstract r1(IILandroid/os/Bundle;)V
.end method
