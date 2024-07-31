.class public final Lff/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lff/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:[Lvk/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lvk/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lvk/h;

    new-instance v1, Lkotlin/jvm/internal/t;

    const-string v2, "dataStore"

    const-string v3, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const-class v4, Lff/f$a;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/t;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/y;->e(Lkotlin/jvm/internal/s;)Lvk/g;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lff/f$a;->a:[Lvk/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lff/f$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lff/f$a;Landroid/content/Context;)Lx0/f;
    .locals 0

    invoke-direct {p0, p1}, Lff/f$a;->b(Landroid/content/Context;)Lx0/f;

    move-result-object p0

    return-object p0
.end method

.method private final b(Landroid/content/Context;)Lx0/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lx0/f<",
            "La1/d;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lff/f;->a()Lrk/a;

    move-result-object v0

    sget-object v1, Lff/f$a;->a:[Lvk/h;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p1, v1}, Lrk/a;->a(Ljava/lang/Object;Lvk/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/f;

    return-object p1
.end method


# virtual methods
.method public final c()Lff/f;
    .locals 2

    sget-object v0, Lzb/c;->a:Lzb/c;

    invoke-static {v0}, Lzb/n;->a(Lzb/c;)Lzb/g;

    move-result-object v0

    const-class v1, Lff/f;

    invoke-virtual {v0, v1}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionsSettings::class.java]"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lff/f;

    return-object v0
.end method
