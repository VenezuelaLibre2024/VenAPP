.class public Lz5/a;
.super Ly5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz5/a$a;
    }
.end annotation


# static fields
.field public static final c:Lz5/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz5/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lz5/a;->c:Lz5/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly5/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Application;IZ)Lv5/c;
    .locals 0

    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "android.permission.READ_EXTERNAL_STORAGE"

    const-string p3, "android.permission.WRITE_EXTERNAL_STORAGE"

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ly5/a;->j(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lv5/c;->Authorized:Lv5/c;

    return-object p1

    :cond_0
    sget-object p1, Lv5/c;->Denied:Lv5/c;

    return-object p1
.end method

.method public f(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public m(Ly5/c;Landroid/content/Context;IZ)V
    .locals 1

    const-string p3, "permissionsUtils"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "context"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "android.permission.READ_EXTERNAL_STORAGE"

    const-string p4, "android.permission.WRITE_EXTERNAL_STORAGE"

    filled-new-array {p3, p4}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldk/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p2, p3}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p0, p2, p4}, Ly5/a;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ly5/c;->e()Ly5/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Ly5/b;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, v0}, Ly5/a;->n(Ly5/c;Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method
