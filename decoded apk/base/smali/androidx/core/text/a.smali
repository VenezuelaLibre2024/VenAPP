.class public final Landroidx/core/text/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/text/a$a;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Landroidx/core/text/a$a;->b(Ljava/util/Locale;)Landroid/icu/util/ULocale;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/text/a$a;->a(Ljava/lang/Object;)Landroid/icu/util/ULocale;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/text/a$a;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
