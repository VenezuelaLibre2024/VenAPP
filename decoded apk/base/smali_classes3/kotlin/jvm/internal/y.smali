.class public Lkotlin/jvm/internal/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlin/jvm/internal/z;

.field private static final b:[Lvk/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/internal/z;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/z;

    invoke-direct {v0}, Lkotlin/jvm/internal/z;-><init>()V

    :goto_0
    sput-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    const/4 v0, 0x0

    new-array v0, v0, [Lvk/c;

    sput-object v0, Lkotlin/jvm/internal/y;->b:[Lvk/c;

    return-void
.end method

.method public static a(Lkotlin/jvm/internal/j;)Lvk/e;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/z;->a(Lkotlin/jvm/internal/j;)Lvk/e;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lvk/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/z;->b(Ljava/lang/Class;)Lvk/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lvk/d;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/z;->c(Ljava/lang/Class;Ljava/lang/String;)Lvk/d;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lkotlin/jvm/internal/q;)Lvk/f;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/z;->d(Lkotlin/jvm/internal/q;)Lvk/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/s;)Lvk/g;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/z;->e(Lkotlin/jvm/internal/s;)Lvk/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lkotlin/jvm/internal/i;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/z;->f(Lkotlin/jvm/internal/i;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lkotlin/jvm/internal/o;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/y;->a:Lkotlin/jvm/internal/z;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/z;->g(Lkotlin/jvm/internal/o;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
